package week_5.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<String> data = new ArrayList<>();

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public void insert(String name, String number) {
        StringBuilder rec = new StringBuilder();
        rec.append(name)
                .append(" - ")
                .append(number);
        data.add(rec.toString());
    }

    public boolean deleteByPhoneNumber(String number) {
        boolean result = false;
        for (String rec : data) {
            if (rec.contains(number)) {
                data.remove(rec);
                result = true;
                break;
            }
        }
        return result;
    }

    public ArrayList<String> getAllNamesStartingWith(String name) {
        ArrayList<String> result = new ArrayList<>();
        for (String rec : data) {
            if (rec.startsWith(name)) {
                result.add(rec);
            }
        }
        return result;
    }

    public String toString() {
        StringBuilder phonebook = new StringBuilder();
        for (String rec : data) {
            phonebook.append(rec).append("\n");
        }
        return phonebook.toString();
    }
//
//    public void printAllRecords() {
//
//    }

    public boolean existsRecord(String record) {
        boolean result = false;
        for (String rec : data) {
            if (rec.equalsIgnoreCase(record)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean overwriteExisting(String record) {
        for (String rec : data) {
            if (rec.equalsIgnoreCase(record)) {
                rec = record;
                return true;
            }
        }
        return false;
    }

}

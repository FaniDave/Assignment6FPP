package Day6.Assigment;

//MyTable class (Outer class)
public class MyTable {
    //Instance fields
    private Entry[] entries;

    //Constructor of Outer class
    public MyTable() {
        entries = new Entry[26];
    }

    //Member Inner class
    private class Entry {
        char character;
        String value;

        Entry(char character, String value) {
            this.character = character;
            this.value = value;
        }

        @Override
        public String toString() {
            return character + "->" + value;
        }
    }

    // add() method to add character and corresponding string
    public void add(char c, String s) {
        int index = c - 'a';
        entries[index] = new Entry(c, s);
    }

    // Method to get the string matched with character c in the table
    public String get(char c) {
        int index = c - 'a';
        if ((index >= 0) && index < (entries.length) && entries[index] != null) {
            return entries[index].value;
        }
        return null;
    }

    //toString() method
    @Override
    public String toString() {
        String result = "";
        for (Entry entry : entries) {
            if (entry != null) {
                result += entry.toString() + "\n";
            }
        }
        return result.trim();
    }
}

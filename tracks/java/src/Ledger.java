import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * The Ledger class provides functionality to create and format ledger entries.
 * It supports different currencies and locales for formatting purposes.
 */
public class Ledger {
    /**
     * Creates a new ledger entry with a date, description, and change amount.
     *
     * @param d    The date of the ledger entry in YYYY-MM-DD format.
     * @param desc The description of the ledger entry.
     * @param c    The change amount of the ledger entry in cents.
     * @return A new LedgerEntry object.
     */
    public LedgerEntry createLedgerEntry(String d, String desc, int c) {
        LedgerEntry le = new LedgerEntry();
        le.setChange(c);
        le.setDescription(desc);
        le.setLocalDate(LocalDate.parse(d));
        return le;
    }

    /**
     * Formats a list of ledger entries into a string based on the specified
     * currency
     * and locale. Supports "USD" and "EUR" currencies and "en-US" and "nl-NL"
     * locales.
     *
     * @param cur     The currency code ("USD" or "EUR").
     * @param loc     The locale code ("en-US" or "nl-NL").
     * @param entries An array of LedgerEntry objects to format.
     * @return A formatted string representing the ledger entries.
     * @throws IllegalArgumentException If an invalid currency or locale is
     *                                  provided.
     */
    public String format(String cur, String loc, LedgerEntry[] entries) {
        String s = null;
        String header = null;
        String curSymb = null;
        String datPat = null;
        String decSep = null;
        String thSep = null;
        if (!cur.equals("USD") && !cur.equals("EUR")) {
            throw new IllegalArgumentException("Invalid currency");
        } else if (!loc.equals("en-US") && !loc.equals("nl-NL")) {
            throw new IllegalArgumentException("Invalid locale");
        } else {
            if (cur.equals("USD")) {
                if (loc.equals("en-US")) {
                    curSymb = "$";
                    datPat = "MM/dd/yyyy";
                    decSep = ".";
                    thSep = ",";
                    header = "Date       | Description               | Change       ";
                } else if (loc.equals("nl-NL")) {
                    curSymb = "$";
                    datPat = "dd/MM/yyyy";
                    decSep = ",";
                    thSep = ".";
                    header = "Datum      | Omschrijving              | Verandering  ";
                }
            } else if (cur.equals("EUR")) {
                if (loc.equals("en-US")) {
                    curSymb = "€";
                    datPat = "MM/dd/yyyy";
                    decSep = ".";
                    thSep = ",";
                    header = "Date       | Description               | Change       ";
                } else if (loc.equals("nl-NL")) {
                    curSymb = "€";
                    datPat = "dd/MM/yyyy";
                    decSep = ",";
                    thSep = ".";
                    header = "Datum      | Omschrijving              | Verandering  ";
                }
            }
        }

        s = header;

        if (entries.length > 0) {
            List<LedgerEntry> neg = new ArrayList<>();
            List<LedgerEntry> pos = new ArrayList<>();
            for (int i = 0; i < entries.length; i++) {
                LedgerEntry e = entries[i];
                if (e.getChange() >= 0) {
                    pos.add(e);
                } else {
                    neg.add(e);
                }
            }

            neg.sort((o1, o2) -> o1.getLocalDate().compareTo(o2.getLocalDate()));
            pos.sort((o1, o2) -> o1.getLocalDate().compareTo(o2.getLocalDate()));

            List<LedgerEntry> all = new ArrayList<>();
            all.addAll(neg);
            all.addAll(pos);

            for (int i = 0; i < all.size(); i++) {
                LedgerEntry e = all.get(i);

                String date = e.getLocalDate().format(DateTimeFormatter.ofPattern(datPat));

                String desc = e.getDescription();
                if (desc.length() > 25) {
                    desc = desc.substring(0, 22);
                    desc = desc + "...";
                }

                String converted = null;
                if (e.getChange() < 0) {
                    converted = String.format("%.02f", (e.getChange() / 100) * -1);
                } else {
                    converted = String.format("%.02f", e.getChange() / 100);
                }

                String[] parts = converted.split("\\.");
                String amount = "";
                int count = 1;
                for (int ind = parts[0].length() - 1; ind >= 0; ind--) {
                    if (((count % 3) == 0) && ind > 0) {
                        amount = thSep + parts[0].charAt(ind) + amount;
                    } else {
                        amount = parts[0].charAt(ind) + amount;
                    }
                    count++;
                }

                if (loc.equals("nl-NL")) {
                    amount = curSymb + " " + amount + decSep + parts[1];
                } else {
                    amount = curSymb + amount + decSep + parts[1];
                }

                if (e.getChange() < 0 && loc.equals("en-US")) {
                    amount = "(" + amount + ")";
                } else if (e.getChange() < 0 && loc.equals("nl-NL")) {
                    amount = curSymb + " -" + amount.replace(curSymb, "").trim() + " ";
                } else if (loc.equals("nl-NL")) {
                    amount = " " + amount + " ";
                } else {
                    amount = amount + " ";
                }

                s = s + "\n";
                s = s + String.format("%s | %-25s | %13s",
                        date,
                        desc,
                        amount);
            }

        }

        return s;
    }

    /**
     * The LedgerEntry class represents a single entry in the ledger.
     */
    public static class LedgerEntry {
        LocalDate localDate;
        String description;
        double change;

        /**
         * Gets the date of the ledger entry.
         *
         * @return The local date of the entry.
         */
        public LocalDate getLocalDate() {
            return localDate;
        }

        /**
         * Sets the date of the ledger entry.
         *
         * @param localDate The local date to set.
         */
        public void setLocalDate(LocalDate localDate) {
            this.localDate = localDate;
        }

        /**
         * Gets the description of the ledger entry.
         *
         * @return The description of the entry.
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the description of the ledger entry.
         *
         * @param description The description to set.
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         * Gets the change amount of the ledger entry.
         *
         * @return The change amount in cents.
         */
        public double getChange() {
            return change;
        }

        /**
         * Sets the change amount of the ledger entry.
         *
         * @param change The change amount in cents to set.
         */
        public void setChange(double change) {
            this.change = change;
        }
    }

}

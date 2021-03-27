package com.cms.database;

public class StringBase {
    public static final String welcome ="====================================================================\n"
            + "| Welcome to Consumer Management System. Enter value [1-6] for below actions.\n"
            + "+----------------------------------------+\n"
            + "| 1. Add a consumable                    |\n"
            + "+----------------------------------------+\n"
            + "| 2. Edit a consumable                   |\n"
            + "+----------------------------------------+\n"
            + "| 3. Delete a consumable                 |\n"
            + "+----------------------------------------+\n"
            + "| 4. See the list of consumables         |\n"
            + "+----------------------------------------+\n"
            + "| 5. See Overall info                    |\n"
            + "+----------------------------------------+\n"
            + "| 6. Exit                                |\n"
            + "====================================================================\n";
    public static final String rowLine = "+------------+-------------------------+---------------"
            + "+---------------+--------------------------+----------+-------------------------+";
    public static final String consumableType = "Enter Consumable Type [1-3]: \n"
            + "1. Book\n" + "2. Series\n" + "3. Movie\n";
    public static final String rowRuler = "====================================================\n";
    public static final String editWelcome = "Welcome to Editable field.\n"
            + rowRuler
            + "Enter Total consumption time: ";
    public static final String endingDateWarningMessage = "Enter Consumption Ending Date: "
            + "Warning: once updated, the consumable can not be edited anymore"
            + "[Press Enter to Escape]";
    public static final String overallWelcomeString = "========================================"
                    +"Overall Info: \n" + "========================================\n";
    public static final String flatRuler = "|---------------------------------------------------------|\n";
    public static final String listType = "You Want to visualize: \n"
            + "1. All the List\n" + "2. Individually\n" + "Enter Choice: ";

}

package com.example.apptelefonos.bd;

public final class TablaAgenda {

    private TablaAgenda() {
    }

    public static final String TABLE_NAME = "Agenda";
    public static final String CAMPO_ID = "Num_Agenda";
    public static final String CAMPO_NUM_TELEF = "Num_Telf";


    protected static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TablaAgenda.TABLE_NAME + " (" +
                    TablaAgenda.CAMPO_ID + " INTEGER PRIMARY KEY," +
                    TablaAgenda.CAMPO_NUM_TELEF + " INTEGER PRIMARY KEY," +
                    "FOREIGN KEY(" + TablaAgenda.CAMPO_NUM_TELEF + ") REFERENCES " +
                    TablaClientes.TABLE_NAME + "(" + TablaClientes.CAMPO_ID + "))";

    protected static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TablaAgenda.TABLE_NAME;

}

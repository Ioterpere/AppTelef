package com.example.apptelefonos.bd;

public final class TablaClientes {

    private TablaClientes() {
    }

    public static final String TABLE_NAME = "Clientes";
    public static final String CAMPO_ID = "Num_Telf";
    public static final String CAMPO_NOMBRE = "Nombre";
    public static final String CAMPO_NUM_AGENDA = "Num_Agenda";
    public static final String CAMPO_ESTADO = "Estado";


    protected static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TablaClientes.TABLE_NAME + " (" +
                    TablaClientes.CAMPO_ID + " INTEGER PRIMARY KEY," +
                    TablaClientes.CAMPO_NOMBRE + " TEXT," +
                    TablaClientes.CAMPO_NUM_AGENDA + " INTEGER," +
                    TablaClientes.CAMPO_ESTADO + " TEXT," +
                    "FOREIGN KEY(" + TablaClientes.CAMPO_NUM_AGENDA + ") REFERENCES " +
                    TablaAgenda.TABLE_NAME + "(" + TablaAgenda.CAMPO_ID + "))";

    protected static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TablaClientes.TABLE_NAME;

}

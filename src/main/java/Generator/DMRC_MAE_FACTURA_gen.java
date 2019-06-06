package Generator;

import Drivers.DriverOracle;
import Models.DMRC_MAE_FACTURA;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DMRC_MAE_FACTURA_gen {

    public DriverOracle driverOracle = new DriverOracle();
    //public String TABLE_NAME = "DMRC_MAE_FACTURA";

    public void init_DMRC_MAE_FACTURA(){

        try{
            System.out.println("Va a iniciar DMRC_MAE_FACTURA para generar datos ");
            Connection connection = driverOracle.getConnection();
            Statement stmt = connection.prepareStatement("insert into DMRC_MAE_FACTURA_PARTITIONED(ID_NUM_CONTR,ID_NUM_FACTURA,FCH_GENERACION_INFO,FCH_FACTURACION,IMP_FACTURA_INTERESES,IMP_PAGO_INTERESES_CLIENTE,FCH_FIN_PERIODO_PAGO,FLG_PAGO_TIEMPO,IMP_A_PAGAR_TOTAL,IMP_FACTURA_CAPITAL,IMP_PAGO_CAPITAL_CLIENTE,FCH_CARGA_INFO,IMP_PAGO_MO,IMP_PAGO_FACTURA_MO,FCH_FACTURA_PAGADA) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            DMRC_MAE_FACTURA d = new DMRC_MAE_FACTURA(
                    "1",
                    "1",
                    java.sql.Date.valueOf("2019-05-27"),
                    java.sql.Date.valueOf("2019-05-27"),
                    1,
                    2,
                    java.sql.Date.valueOf("2019-05-27"),
                    4,
                    5,
                    6,
                    7,
                    java.sql.Date.valueOf("2019-05-27"),
                    8,
                    9,
                    java.sql.Date.valueOf("2019-05-27")
            );

            for (int i = 0; i < 3000000; i++){
                ((PreparedStatement) stmt).setString(1, "000" + String.valueOf(1730000000000l + i ));
                ((PreparedStatement) stmt).setString(2, String.valueOf(i));
                ((PreparedStatement) stmt).setDate(3, java.sql.Date.valueOf("2019-01-03"));
                ((PreparedStatement) stmt).setDate(4, java.sql.Date.valueOf("2018-03-19"));
                ((PreparedStatement) stmt).setInt(5, 1);
                ((PreparedStatement) stmt).setInt(6, 2);
                ((PreparedStatement) stmt).setDate(7, java.sql.Date.valueOf("2018-04-16"));
                ((PreparedStatement) stmt).setInt(8, 3);
                ((PreparedStatement) stmt).setInt(9, 4);
                ((PreparedStatement) stmt).setInt(10, 5);
                ((PreparedStatement) stmt).setInt(11, 6);
                ((PreparedStatement) stmt).setDate(12, java.sql.Date.valueOf("2018-11-11"));
                ((PreparedStatement) stmt).setInt(13, 7);
                ((PreparedStatement) stmt).setInt(14, 8);
                ((PreparedStatement) stmt).setDate(15, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).executeUpdate();

                if((i % 1000) == 0)
                    System.out.println("Almacenando datos " + new java.util.Date().toString());
            }

            System.out.println("Se ha terminado la inserción ");
            connection.close();
        }catch (Exception error){
            System.out.println("Error: " + error);
        }


    }
}


/*
 String sql = "INSERT INTO " + TABLE_NAME + " VALUES (" +
                        String.valueOf(i) + ", " +
                        d.ID_NUM_FACTURA + ", " +
                        d.FCH_GENERACION_INFO + ", " +
                        d.FCH_FACTURACION + ", " +
                        d.IMP_FACTURA_INTERESES + ", " +
                        d.IMP_PAGO_INTERESES_CLIENTE + ", " +
                        d.FCH_FIN_PERIODO_PAGO + ", " +
                        d.FLG_PAGO_TIEMPO + ", " +
                        d.IMP_A_PAGAR_TOTAL + ", " +
                        d.IMP_FACTURA_CAPITAL + ", " +
                        d.IMP_PAGO_CAPITAL_CLIENTE + ", " +
                        d.FCH_CARGA_INFO + ", " +
                        d.IMP_PAGO_MO + ", " +
                        d.IMP_PAGO_FACTURA_MO + ", " +
                        d.FCH_FACTURA_PAGADA +
                        ")";
 */
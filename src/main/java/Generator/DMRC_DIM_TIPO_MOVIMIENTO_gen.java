package Generator;

import Drivers.DriverOracle;
import Models.DMRC_MAE_FACTURA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DMRC_DIM_TIPO_MOVIMIENTO_gen {

    public DriverOracle driverOracle = new DriverOracle();
    //public String TABLE_NAME = "DMRC_MAE_FACTURA";

    public void init_DMRC_DIM_TIPO_MOVIMIENTO(){

        try{
            System.out.println("Va a iniciar DMRC_DIM_TIPO_MOVIMIENTO para generar datos ");
            Connection connection = driverOracle.getConnection();
            Statement stmt = connection.prepareStatement("insert into SYSTEM.DMRC_DIM_TIPO_MOVIMIENTO(" +
                    "ID_TIPO_MOVIMIENTO, TXT_DESC_TIPO_MOVIMIENTO , FCH_DES, FCH_HAS, FLG_ACTIVO, ID_PAGO_EXIGIBLE) " +
                    "values (?, ?, ?, ?, ?, ?)");


            for (int i = 0; i < 100; i++){
                ((PreparedStatement) stmt).setString(1,String.valueOf(i));
                ((PreparedStatement) stmt).setString(2, String.valueOf(i));
                ((PreparedStatement) stmt).setDate(3, java.sql.Date.valueOf("2015-01-03"));
                ((PreparedStatement) stmt).setDate(4, java.sql.Date.valueOf("2018-03-19"));
                ((PreparedStatement) stmt).setInt(5, 1);
                ((PreparedStatement) stmt).setString(6, String.valueOf(5));

                ((PreparedStatement) stmt).executeUpdate();

            }

            System.out.println("Se ha terminado la inserción ");
            connection.close();
        }catch (Exception error){
            System.out.println("Error: " + error);
        }


    }
}

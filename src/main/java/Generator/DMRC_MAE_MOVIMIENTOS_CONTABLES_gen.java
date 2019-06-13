package Generator;

import Drivers.DriverOracle;
import Models.DMRC_MAE_FACTURA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DMRC_MAE_MOVIMIENTOS_CONTABLES_gen {

    public DriverOracle driverOracle = new DriverOracle();
    //public String TABLE_NAME = "DMRC_MAE_FACTURA";

    public void init_DMRC_MAE_MOVIMIENTOS_CONTABLES(){

        try{
            System.out.println("Va a iniciar DMRC_MAE_MOVIMIENTOS_CONTABLES para generar datos ");
            Connection connection = driverOracle.getConnection();
            Statement stmt = connection.prepareStatement("insert into SYSTEM.DMRC_MAE_MOVIMIENTOS_CONTABLES(" +
                    "ID_NUM_MOVIMIENTO, FCH_MOVIMIENTO, IMP_MOVIMIENTO, FCH_VALOR, ID_NUM_CONTR, FCH_CARGA_INFO, " +
                    "FCH_GENERACION_INFO, FLG_SIGNO_MOVIMIENTO, ID_TIPO_MOVIMIENTO, IMP_MOVIMIENTO_MO, ID_SISTEMA_ORIGEN) " +
                    "values (?,?,?,?,?,?,?,?,?,?,?)");


            for (int i = 0; i < 100; i++){
                ((PreparedStatement) stmt).setString(1, "000" + String.valueOf(1730000000000l + i ));
                ((PreparedStatement) stmt).setDate(2, java.sql.Date.valueOf("2015-01-03"));
                ((PreparedStatement) stmt).setInt(3, 4);
                ((PreparedStatement) stmt).setDate(4, java.sql.Date.valueOf("2018-03-19"));
                ((PreparedStatement) stmt).setString(5, String.valueOf(i));

                ((PreparedStatement) stmt).setDate(6, java.sql.Date.valueOf("2018-04-16"));
                ((PreparedStatement) stmt).setDate(7, java.sql.Date.valueOf("2018-04-16"));
                ((PreparedStatement) stmt).setInt(8, 3);
                ((PreparedStatement) stmt).setString(9, String.valueOf(i));
                ((PreparedStatement) stmt).setInt(10, 5);

                ((PreparedStatement) stmt).setString(11, String.valueOf(i));
                ((PreparedStatement) stmt).executeUpdate();

            }

            System.out.println("Se ha terminado la inserción ");
            connection.close();
        }catch (Exception error){
            System.out.println("Error: " + error);
        }


    }
}

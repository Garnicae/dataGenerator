package Generator;

import Drivers.DriverOracle;
import Models.DMRC_MAE_FACTURA;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DMRC_MAE_CONTR_DIARIO_gen {

    public DriverOracle driverOracle = new DriverOracle();
    //public String TABLE_NAME = "DMRC_MAE_FACTURA";

    public void init_DMRC_MAE_CONTR_DIARIO(){

        try{
            System.out.println("Va a iniciar DMRC_MAE_CONTR_DIARIO_PARTIOCIONED para generar datos ");
            Connection connection = driverOracle.getConnection();
            Statement stmt = connection.prepareStatement("insert into SYSTEM.DMRC_MAE_CONTR_DIARIO(" +
                    "ID_NUM_CONTR, FCH_INFO, ID_COMPRA_VENTA_CARTERA, ID_SIT_CONTABLE_LOCAL, ID_TIPO_TASA, ID_SISTEMA_ORIGEN, " +
                    "FLG_AVAL_TECNICO, VAL_PERIODO_AMORT_CAPITAL, VAL_PERIODO_AMORT_INTERESES, FCH_EXIG_CAPITAL, FCH_EXIG_INTERESES, " +
                    "FCH_APERTURA_CONTR, FCH_FIN_CONTR, IMP_CAPITAL_BANCO_NO_EXIG, IMP_CAPITAL_AJENO_NO_EXIG, IMP_CAPITAL_BANCO_EXIG, " +
                    "IMP_CAPITAL_AJENO_EXIG, IMP_LINEA_EXPRESS, IMP_ACCESORIOS, IMP_INTERESES_DEV_BANCO, IMP_INTERESES_DEV_AJENO, " +
                    "IMP_INTERESES_EXIGIBLE_BANCO, IMP_INTERESES_EXIGIBLE_AJENO, IMP_RESERVA_INTERESES, IMP_RESERVA_INTERESES_CAPITAL, " +
                    "IMP_DISPONIBLE, IMP_RIESGO_FIRMA, IMP_QUITA_CAPITAL, IMP_QUITA_INTERESES, FCH_CARGA_INFO, IMP_VENCIDO, IMP_CASTIGADO, " +
                    "ID_TIPO_PRODUCTO, ID_SUBTIPO_PRODUCTO, ID_EMPRESA, ID_TIPO_AMORTIZACION , IMP_INICIAL_CONCEDIDO, FCH_CASTIGO, " +
                    "ID_DIVISA, FLG_CONTR_BAJO_LINEA_CREDITO, FCH_INIC_CARENCIA_CAPITAL, FCH_INIC_CARENCIA_INTERESES, " +
                    "FCH_FIN_CARENCIA_CAPITAL, FCH_FIN_CARENCIA_INTERESES, VAL_TIPO_INTERES, FCH_EXIG_CAPITAL_ULT_DIA_NAT, " +
                    "FCH_EXIG_INTERESES_ULT_DIA_NAT, FLG_INTEGRACION_EXPEDIENTE, ID_FINALIDAD_CONTRATO , IMP_INICIAL_PREVISTO_PAGOS, " +
                    "IMP_VALOR_BIEN_FINANCIADO, ID_ESTADO_MEXICO_JUICIO, TXT_DESC_SEG_RIESGOS , FLG_FIDEICOMISO_CONVENIO_JUD, " +
                    "IMP_SUBCUENTA_VIVIENDA, IMP_SEGURO_DESEMPLEO, PORC_SPREAD , FLG_CREDITO_GRUPAL, FCH_PROXIMO_CORTE, ID_TIPO_BLOQUEO , " +
                    "FLG_CUENTA_EJE, NUM_PAGOS_CONTRATO , IMP_PROXIMO_PAGO, FCH_ULTIMO_PAGO, FCH_LIQUIDACION, IMP_DACION_PAGO, " +
                    "IMP_QUEBRANTO_CASTIGO, FCH_ENTRADA_ACLARACION, FCH_PRIMER_INCUMPLIMIENTO, IMP_SEGURO_VIDA, " +
                    "FCH_ULTIMA_COMPRA_DISPOSICION, NUM_PAGOS_VENCIDOS , IMP_LIMITE, ID_TIPO_FRAUDE , NUM_PAN, FLG_COBRANZA_DELEGADA, " +
                    "TIPO_CAMBIO_MXN , PORC_COBERTURA_HIPOTECARIA , DESC_ESTADO_MEXICO, DESC_TERRITORIAL, DESC_CANAL_ADMISION, " +
                    "DESC_SEG_RENTA, FLG_CONTR_REPORTADO_NO_BURO, ID_SEG_CONTR_BDR) " +
                    "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, " +
                    "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, " +
                    "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?)");

            for (int i = 0; i < 1000000; i++){
                ((PreparedStatement) stmt).setString(1, "000" + String.valueOf(1730000000000l + i ));
                ((PreparedStatement) stmt).setDate(2, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setString(3, String.valueOf(i));
                ((PreparedStatement) stmt).setString(4, String.valueOf(i));
                ((PreparedStatement) stmt).setString(5, "V");
                ((PreparedStatement) stmt).setString(6, "Pampa");
                ((PreparedStatement) stmt).setInt(7, 4);
                ((PreparedStatement) stmt).setInt(8, 4);
                ((PreparedStatement) stmt).setInt(9, 4);
                ((PreparedStatement) stmt).setDate(10, java.sql.Date.valueOf("2018-03-30"));

                ((PreparedStatement) stmt).setDate(11, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setDate(12, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setDate(13, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setInt(14, 4);
                ((PreparedStatement) stmt).setInt(15, 4);
                ((PreparedStatement) stmt).setInt(16, 4);
                ((PreparedStatement) stmt).setInt(17, 4);
                ((PreparedStatement) stmt).setInt(18, 4);
                ((PreparedStatement) stmt).setInt(19, 4);
                ((PreparedStatement) stmt).setInt(20, 4);

                ((PreparedStatement) stmt).setInt(21, 4);
                ((PreparedStatement) stmt).setInt(22, 4);
                ((PreparedStatement) stmt).setInt(23, 4);
                ((PreparedStatement) stmt).setInt(24, 4);
                ((PreparedStatement) stmt).setInt(25, 4);
                ((PreparedStatement) stmt).setInt(26, 4);
                ((PreparedStatement) stmt).setInt(27, 4);
                ((PreparedStatement) stmt).setInt(28, 4);
                ((PreparedStatement) stmt).setInt(29, 4);
                ((PreparedStatement) stmt).setDate(30, java.sql.Date.valueOf("2018-03-30"));

                ((PreparedStatement) stmt).setInt(31, 4);
                ((PreparedStatement) stmt).setInt(32, 4);
                ((PreparedStatement) stmt).setString(33, String.valueOf(i));
                ((PreparedStatement) stmt).setString(34, String.valueOf(i));
                ((PreparedStatement) stmt).setString(35, String.valueOf(i));
                ((PreparedStatement) stmt).setString(36, String.valueOf(i));
                ((PreparedStatement) stmt).setInt(37, 4);
                ((PreparedStatement) stmt).setDate(38, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setString(39, String.valueOf(i));
                ((PreparedStatement) stmt).setInt(40, 4);

                ((PreparedStatement) stmt).setDate(41, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setDate(42, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setDate(43, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setDate(44, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setInt(45, 4);
                ((PreparedStatement) stmt).setDate(46, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setDate(47, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setInt(48, 4);
                ((PreparedStatement) stmt).setString(49, String.valueOf(i));
                ((PreparedStatement) stmt).setInt(50, 4);

                ((PreparedStatement) stmt).setInt(51, 4);
                ((PreparedStatement) stmt).setString(52, String.valueOf(i));
                ((PreparedStatement) stmt).setString(53, String.valueOf(i));
                ((PreparedStatement) stmt).setInt(54, 4);
                ((PreparedStatement) stmt).setInt(55, 4);
                ((PreparedStatement) stmt).setInt(56, 4);
                ((PreparedStatement) stmt).setInt(57, 4);
                ((PreparedStatement) stmt).setInt(58, 4);
                ((PreparedStatement) stmt).setDate(59, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setString(60, String.valueOf(i));

                ((PreparedStatement) stmt).setInt(61, 4);
                ((PreparedStatement) stmt).setInt(62, 4);
                ((PreparedStatement) stmt).setInt(63, 4);
                ((PreparedStatement) stmt).setDate(64, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setDate(65, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setInt(66, 4);
                ((PreparedStatement) stmt).setInt(67, 4);
                ((PreparedStatement) stmt).setDate(68, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setDate(69, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setInt(70, 4);

                ((PreparedStatement) stmt).setDate(71, java.sql.Date.valueOf("2018-03-30"));
                ((PreparedStatement) stmt).setInt(72, 4);
                ((PreparedStatement) stmt).setInt(73, 4);
                ((PreparedStatement) stmt).setString(74, String.valueOf(i));
                ((PreparedStatement) stmt).setInt(75, 4);
                ((PreparedStatement) stmt).setInt(76, 4);
                ((PreparedStatement) stmt).setInt(77, 4);
                ((PreparedStatement) stmt).setInt(78, 4);
                ((PreparedStatement) stmt).setString(79, String.valueOf(i));
                ((PreparedStatement) stmt).setString(80, String.valueOf(i));

                ((PreparedStatement) stmt).setString(81, String.valueOf(i));
                ((PreparedStatement) stmt).setString(82, "Particulares Rentas Masivas");
                ((PreparedStatement) stmt).setInt(83, 4);
                ((PreparedStatement) stmt).setString(84, String.valueOf(i));
                ((PreparedStatement) stmt).executeUpdate();


            }

            System.out.println("Se ha terminado la inserción ");
            connection.close();
        }catch (Exception error){
            System.out.println("Error: " + error);
        }


    }
}

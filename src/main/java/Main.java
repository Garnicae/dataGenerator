
import Generator.*;

public class Main {

    private static DMRC_MAE_FACTURA_gen dmrc_mae_factura_gen = new DMRC_MAE_FACTURA_gen();
    private static DMRC_MAE_CONTR_DIARIO_gen dmrc_mae_contr_diario_gen = new DMRC_MAE_CONTR_DIARIO_gen();
    private static DMRC_MAE_CONTR_MENSUAL_gen dmrc_mae_contr_mensual_gen = new DMRC_MAE_CONTR_MENSUAL_gen();
    private static DMRC_MAE_MOVIMIENTOS_CONTABLES_gen dmrc_mae_movimientos_contables_gen = new DMRC_MAE_MOVIMIENTOS_CONTABLES_gen();
    private static DMRC_DIM_TIPO_MOVIMIENTO_gen dmrc_dim_tipo_movimiento_gen = new DMRC_DIM_TIPO_MOVIMIENTO_gen();

    public static void main(String[] args) {

        //dmrc_mae_factura_gen.init_DMRC_MAE_FACTURA();
        //dmrc_mae_contr_diario_gen.init_DMRC_MAE_CONTR_DIARIO();
        //dmrc_mae_movimientos_contables_gen.init_DMRC_MAE_MOVIMIENTOS_CONTABLES();
        dmrc_mae_contr_mensual_gen.init_DMRC_MAE_CONTR_MENSUAL();
        //dmrc_dim_tipo_movimiento_gen.init_DMRC_DIM_TIPO_MOVIMIENTO();

    }
}


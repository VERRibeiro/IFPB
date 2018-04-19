package model;

public enum TIPO implements EstratégiaDePagamento {
    NORMAL {
        @Override
        public double calculcarPagmento(int diasAlugada) {
            double valorCorrente = 2;
            if(diasAlugada > 2) {
                valorCorrente += (diasAlugada - 2) * 1.5;
            }
            return valorCorrente;
        }
    },
    LANÇAMENTO{
        @Override
        public double calculcarPagmento(int diasAlugada) {
            double valorCorrente = diasAlugada * 3;
            return valorCorrente;
        }
    },
    INFANTIL{
        @Override
        public double calculcarPagmento(int diasAlugada) {
            double valorCorrente = 1.5;
            if(diasAlugada > 3) {
                valorCorrente += (diasAlugada - 3) * 1.5;
            }
            return valorCorrente;
        }
    },

}

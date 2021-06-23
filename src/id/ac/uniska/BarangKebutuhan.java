package id.ac.uniska;

public class BarangKebutuhan extends PenjualanPeralatanStreaming {
        private String idPenjual;
        private String namaPenjual;
        private int jumlahPenjual;

        public void biayaKaryawan(){

        }
        public void diskon(){

        }

        public String getIdPenjual() {
                return idPenjual;
        }

        public void setIdPenjual(String idPenjual) {
                this.idPenjual = idPenjual;
        }

        public String getNamaPenjual() {
                return namaPenjual;
        }

        public void setNamaPenjual(String namaPenjual) {
                this.namaPenjual = namaPenjual;
        }

        public int getJumlahPenjual() {
                return jumlahPenjual;
        }

        public void setJumlahPenjual(int jumlahPenjual) {
                this.jumlahPenjual = jumlahPenjual;
        }

        @Override
        public void menjualBarang() {
                super.menjualBarang();
        }

        @Override
        public void memberiDiskon() {
                super.memberiDiskon();
        }
}


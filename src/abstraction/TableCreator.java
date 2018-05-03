package abstraction;

public abstract class TableCreator {

    void drawTable(){
        //menentukan jumlah baris
        int jmlBaris = getJmlBaris();
        System.out.println("jmlh baris : "+jmlBaris);

        //menentukan jumlah kolom
        int jmlKolom = getJmlKolom();

        buatFileExcel();
        buatSheet();

        for (int i = 0; i < jmlBaris; i++) {
            for (int j = 0; j < jmlKolom; j++) {
                //menentukan font size, type, warna
                TableProperty tp = getTableProperty(i, j);
                drawTablePerPixel(i,j,tp);
            }
        }
    }

     void drawTablePerPixel(int row, int col, TableProperty tp) {
        //&^&&*&^*^**&^&***
        System.out.println(String.format("Menggambar table Baris %d Kolom %d. " +
                "Type : %s | Warna : %s | Size : %d", row, col, tp.getType(), tp.getWarna(), tp.getFontSize()));
    }

    private void buatSheet() {
        //%$%^$%^^%^$%^##%%%^^%$$^&%
    }

    private void buatFileExcel() {
        //%$%^$%^^%^$%^##%%%^^%$$^&%
    }

    abstract TableProperty getTableProperty(int row, int col);
    abstract int getJmlKolom();
    abstract int getJmlBaris();
}

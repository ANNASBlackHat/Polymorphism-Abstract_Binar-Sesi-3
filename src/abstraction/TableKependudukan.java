package abstraction;

public class TableKependudukan extends TableCreator {

    @Override
    void drawTablePerPixel(int row, int col, TableProperty tp) {
        if(col == 0 && row == 1) tp.setWarna("HIJAU");
        super.drawTablePerPixel(row, col, tp);
    }

    @Override
    TableProperty getTableProperty(int row, int col) {
        if(row == 0){
            return new TableProperty("hitam", "bold", 14);
        }

        return new TableProperty("hitam", "reguler", 12);
    }

    @Override
    int getJmlKolom() {
        return 3;
    }

    @Override
    int getJmlBaris() {
        return 5;
    }

}

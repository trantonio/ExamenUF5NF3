package AntonioAguirre.Exercici1;

import Utils.Constantes;
import Utils.MoveFile;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Exercici1 implements Constantes {
    static File fdir1 = new File(PATH_EX1_DIR1);
    static File fdir2 = new File(PATH_EX1_DIR2);

    public static void main(String[] args) throws IOException {

        int f1 = FileUtils.sizeOfDirectoryAsBigInteger(fdir1).intValue();
        int f2 = FileUtils.sizeOfDirectoryAsBigInteger(fdir2).intValue();
        if(f1 > f2){
            MoveFile.MoveOnlyTxt(PATH_EX1_DIR1);
        }else {
            MoveFile.MoveOnlyTxt(Constantes.PATH_EX1_DIR2);
        }
//        System.out.println(CalcularTamaño(directori1));
    }

    public void comprobarExistenciaDirectori(){

    }
}

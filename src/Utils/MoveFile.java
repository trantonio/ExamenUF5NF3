package Utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class MoveFile implements Constantes {

    static File patata = new File(PATH_PATATA);
    public static void MoveOnlyTxt(String path) throws IOException {
        String subdirectorio="patata";

        comprobarExistenciaDirectori(PATH_EX1,"patata");
        File[] archivos = new File(path).listFiles();
        for(File f : archivos){
            String nameFile = f.getName();
            if (nameFile.matches(".*.txt+")){
                System.out.println(f);
                if(f.isDirectory()){
                    FileUtils.moveDirectoryToDirectory(f,patata,false);
                }else{
                    FileUtils.moveFileToDirectory(f,patata,false);
                }
            }
        }
        System.out.println("Movido a "+ patata + " con exito!");

    }

        public static void comprobarExistenciaDirectorio() {
            File[] archivosEx1 = new File(PATH_EX1).listFiles();

            if(patata.exists()){
                File[] archivosPatata = patata.listFiles();
                for (File f : archivosPatata){
                    f.delete();
                }
            }else{
                patata.mkdir();
            }

        }
    public static File comprobarExistenciaDirectori(String path, String nameDir) {
        File[] archivos = new File(path).listFiles();
        File patata = new File(path+FS+nameDir);
        if(patata.exists()){
            File[] archivosPatata = patata.listFiles();
            for (File f : archivosPatata){
                f.delete();
            }
            System.out.println("Eliminado contenido!");
        }else{
            patata.mkdir();
            System.out.println(nameDir+" creado!");
        }
        return patata;
    }

}


package AntonioAguirre.Exercici2;

import Utils.Constantes;
import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exercici2 implements Constantes {

    public static void main(String[] args) throws IOException {
        String files="";
        File[] archivos = new File(PATH_EX2).listFiles();
        for (File f : archivos) {
            String nameFile = f.getName();
            if (nameFile.matches(".*.txt+")) {
                System.out.println(f);
                files += ""+f+'\n';
                llegirICopiarFitxer(files);
            }

        }

    }
    public static void llegirICopiarFitxer(String str) throws IOException {
        String ruta = PATH_OUT+"copiaDeTotsElsTxt";
        File archivo = new File(ruta);
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(""+str);
        bw.close();

    }
}
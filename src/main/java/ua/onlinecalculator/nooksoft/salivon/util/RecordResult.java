package ua.onlinecalculator.nooksoft.salivon.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;
import ua.onlinecalculator.nooksoft.salivon.controller.dao.file.FileDaoImpl;

@Component
public class RecordResult {

    private String expretion;

    public String getExpretion() {
        return expretion;
    }

    public void setExpretion(String expretion) {
        this.expretion = expretion;
    }

    public void record() {
        File file = new File("last-result.csv");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
            br.write(expretion + "\n");
        } catch (IOException ex) {
            Logger.getLogger(FileDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

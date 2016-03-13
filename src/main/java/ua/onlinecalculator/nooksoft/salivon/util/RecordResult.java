package ua.onlinecalculator.nooksoft.salivon.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class RecordResult {

    private String expretion;
    static Logger log = LogManager.getLogger(RecordResult.class);

    public String getExpretion() {
        return expretion;
    }

    public void setExpretion(String expretion) {
        this.expretion = expretion;
    }

    public void record() {
        log.info("start record exp");
        File file = new File("last-result.csv");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
            br.write(expretion + "\n");
            log.info(expretion, "eng record exp");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}

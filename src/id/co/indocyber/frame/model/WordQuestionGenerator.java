/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.frame.model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public final class WordQuestionGenerator {
    
    public static WordModel[] createQuestion(){
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah di Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan utama di Jakarta");
        WordModel soal3 = new WordModel("Mega Kuningan", "The East Building");
        WordModel soal4 = new WordModel("Grogol", "Trisakti");
        WordModel[] bankSoal = {soal1, soal2, soal3, soal4};
        return bankSoal;
    }

    public static List<WordModel> createQuestionInCollection() {
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah di Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan utama di Jakarta");
        WordModel soal3 = new WordModel("Mega Kuningan", "The East Building");
        WordModel soal4 = new WordModel("Grogol", "Trisakti");

        List<WordModel> bankSoal = new ArrayList<>();
        bankSoal.add(soal1);
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        return bankSoal;
    }
}

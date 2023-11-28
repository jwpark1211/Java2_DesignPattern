package solution;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import template.PeriodicElement;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

public class ChemicalCompoundJSONImporter {
    public static List<ChemicalCompound> importFile(String filePath) {
        System.out.println("file import: "+filePath);
        try (FileReader reader = new FileReader(filePath)) {
            Gson gson = new Gson();
            // TypeToken을 사용하여 List<ChemicalCompound>로 
            List<ChemicalCompound> chemicalCompounds = gson.fromJson(
                reader, new TypeToken<List<ChemicalCompound>>(){}.getType());
            // 각 ChemicalCompound 객체에서 Map<PeriodicElement, Integer>로 변환하여 출력
            for (ChemicalCompound chemicalCompound : chemicalCompounds) {
                Map<PeriodicElement, Integer> compoundMap = chemicalCompound.getCompoundMap();
            }
            return chemicalCompounds;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

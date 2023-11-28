package solution;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class ElementJSONLoader implements FileLoader<Element>{
    @Override
    public List<Element> load(String filePath) {
        System.out.println("file import: "+filePath);
        try (Reader reader = new FileReader(filePath)) {
            //Gson 라이브러리를 이용해 JSON -> List<Element> 변환 
            List<Element> elementList 
                = new Gson().fromJson(reader, new TypeToken<List<Element>>(){}.getType());
            return elementList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

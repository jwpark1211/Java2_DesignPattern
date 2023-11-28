package solution;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.UnknownFormatConversionException;

public class ElementCSVImporter implements FileImporter<Element> {
	//csv 파일 import
    @Override
    public List<Element> importFile(String filePath) {
        List<Element> list = new ArrayList<Element>();
        String line = "";
		
        // load data
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        	System.out.println("file import: " + filePath);
            String delimiter = ",";
            while ((line = br.readLine()) != null) {
            	if (line.contains("#")) {
            		System.out.println("line contains #: " + line);
            		continue;
            	}
                // use comma as separator
                String[] items = line.split(delimiter);
                /*for (String i : items) {
                	System.out.println(i);
                }*/
                Element pe = parse(items); // String[] items -> Element
               	list.add(pe); 
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		//System.out.println("load successfully");
		return new ArrayList(list); 
    }

    @Override
    public void exportFile(String filePath, List<Element> list) {
        FileWriter fw;
		try {
            System.out.println("file save: " + filePath);
			fw = new FileWriter(filePath);
			//Element -> csv 
	        for (var e : list) {
				//System.out.println(e);
	            fw.append(e.toString() + "\n");
	        }
	        fw.flush();
	        fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public static Element parse(String[] items) {
		try {
			//System.out.println("items : " + Arrays.toString(items));
			//csv 파일 parsing
			int number = Integer.parseInt(items[0]);
            String name = items[1];
            String symbol = items[2];
            double mass = Double.parseDouble(items[3]); 
			//element 객체 생성
        	return new Element(number, name, symbol, mass);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException!");
		} catch (UnknownFormatConversionException e) {
			System.out.println("UnknownFormatConversionException!");
		} catch (IllegalArgumentException e) {
			System.out.print("IllegalArgumentException!");
		} 
		return null;
	}
}

package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Iterator;

import template.PeriodicElement;
import template.PeriodicElementImporter;

// Jeong woon Park (Lab7, Dankook University, Department of Software) 2023/11/20
public class MainTest {
    public static void Main(){
        //csv파일에서 PeriodicElement list load
        List<PeriodicElement> list = PeriodicElementImporter.loadCSV("PeriodicElements.csv");
        System.out.println("\n\nDynamicArray add & print");
        //DynamicArray<Element> 선언 
        DataCollection<Element> arr = new DynamicArray<>(list.size());
        //PeriodicElement -> Element 변환 후 arr 저장 
        for (PeriodicElement e : list) {
            arr.put(new Element(e.getNumber(), e.getName(), e.getSymbol(), e.getWeight()));
        }
        //DynamicArray 동작 Test 
        test("DynamicArray Test",list,arr);

        //list<Element> 생성 후 원소 추가 
        List<Element> elements = new ArrayList<>();
        list.forEach(pe -> elements.add(new Element(pe.getNumber(), pe.getName(), pe.getSymbol(),pe.getWeight())));
        //list -> DataCollection Adapter 전환 
        DataCollection<Element> arr2 = new ListDataCollectionAdapter<>(elements);
        //List가 DataCollection처럼 동작하는지 확인 Test 
        test("List to DataCollection Test",list,arr2);
        //Stack<Element> 생성 후 원소 추가 
        Stack<Element> stack = new Stack<>();
        list.forEach(pe->stack.add(new Element(pe.getNumber(), pe.getName(), pe.getSymbol(),pe.getWeight())));
        //Stack -> DataCollection Adapter 전환
        DataCollection<Element> arr3 = new ListDataCollectionAdapter<>(stack);
        //Stack이 DataCollection처럼 동작하는지 확인 Test
        test("Stack to DataCollection Test", list, arr3);

        //ElementJSONLoader -> FileImporter
        FileImporter<Element> importer = new FileLoaderImporterAdapter<>(new ElementJSONLoader());
        //FileImporter로 변환한 ElementJSONLoader로 json 파일 import
        List<Element> elements2 = importer.importFile("Elements.json");
        //elements2.forEach(System.out::println);
        // ElementXMLLoader -> FileImporter
        importer = new FileLoaderImporterAdapter<>(new ElementXMLLoader());
        //FileImporter로 변환한 ElementXMLLoader로 xml 파일 import
        elements2 = importer.importFile("Elements.xml");    
        //elements2.forEach(System.out::println);
        // ElementCSVImporter
        importer = new ElementCSVImporter();
        //ElementCSVImporter로 파일 import, export
        elements2 = importer.importFile("Elements.csv");    
        //elements2.forEach(System.out::println);
        importer.exportFile("Elements1.csv", elements2);
    }

    //DataCollection이 올바르게 동작하는지 확인하는 Test Method 
    public static void test(String testName, List<PeriodicElement> list, DataCollection<Element> arr){
        System.out.println("\n**"+testName+"**");
        //[1] elemAt 동작 확인
        System.out.println("[1] elemAt index 100");
        System.out.println(arr.elemAt(100));
        //[2] clear 동작 확인 
        System.out.println("[2] clear all ");
        arr.clear();
        System.out.println("length: " + arr.length());
        //[3] put 동작 확인 
        System.out.println("[3] put PeriodicElement 1~5 ");
        for(int i=0; i<5; i++){
            PeriodicElement e = list.get(i);
            arr.put(new Element(e.getNumber(), e.getName(), e.getSymbol(), e.getWeight()));
        }
        arr.forEach(System.out::println);
        //[4] insert 동작 확인 
        System.out.println("[4] insert PeriodicElement 6 into index 3");
        PeriodicElement e = list.get(5);
        arr.insert(3, new Element(e.getNumber(), e.getName(), e.getSymbol(), e.getWeight()));
        arr.forEach(System.out::println);
        //[5] remove 동작 확인 
        System.out.println("[5] remove index 3");
        arr.remove(3);
        arr.forEach(System.out::println);
        //[6] remove all using iterator 동작 확인 
        System.out.println("[6] remove all using iterator");
        Iterator<Element> it = arr.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
        arr.forEach(System.out::println);
        System.out.println("**End**\n\n");
    }
    
}

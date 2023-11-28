package solution;

import java.util.List;

public interface FileImporter<E> {
    List<Element> importFile(String filePath); //파일 읽어오기
    void exportFile(String filePath, List<Element> list); //파일 생성
}

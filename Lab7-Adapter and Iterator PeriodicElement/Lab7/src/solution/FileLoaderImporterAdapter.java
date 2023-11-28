package solution;

import java.util.List;

public class FileLoaderImporterAdapter<E> implements FileImporter<Element> {
    private FileLoader fileLoader; //FileImporter로 변환할 FileLoader

    //생성자
    public FileLoaderImporterAdapter(FileLoader fileLoader){
        this.fileLoader = fileLoader;
    }
    @Override
    public List<Element> importFile(String filePath) {
        //FileImporter.importFile -> fileLoader.load
        return fileLoader.load(filePath);
    }
    @Override
    public void exportFile(String filePath, List<Element> list) {
        // 매칭되는 메소드가 없어 구현하지 않음. 
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exportFile'");
    }
}

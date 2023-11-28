package solution;

import java.util.List;

public interface FileLoader<E> {
    List<E> load(String filePath); //파일 로드
}

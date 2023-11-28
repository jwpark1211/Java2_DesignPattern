package solution;

import java.util.ArrayList;
import java.util.List;

public class BoardShaper {
    
    private Board board;

    public void setBoard(Board board){ this.board = board; }

    public List<Integer> row(int rowIndex){
        List<Integer> rowList = new ArrayList<>();

        for(int i=0; i<board.size(); i++){
            rowList.add(board.valueAt(board.size()*(rowIndex-1)+i));
        }

        return rowList;
    }

    public List<Integer> column(int columnIndex){
        List<Integer> columnList = new ArrayList<>();

        for(int i=0; i<board.size(); i++){
            columnList.add(board.valueAt((columnIndex-1)+board.size()*i));
        }

        return columnList;
    }

    public List<Integer> diagonal(){
        List<Integer> diagonalList = new ArrayList<>();

        for(int i=0; i<board.size(); i++){
            diagonalList.add(board.valueAt(i*(board.size()+1)));
        }

        return diagonalList;
    }

    public Board transpose(){
        List<Integer> transposeList = new ArrayList<>();
        for(int i=1; i<=board.size(); i++){
            for(int j=0; j<board.size(); j++){
                transposeList.add(i+j*board.size());
            }
        }
        return new Board(transposeList);
    }
    
}

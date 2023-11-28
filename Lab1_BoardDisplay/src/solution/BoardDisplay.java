package solution;

public class BoardDisplay implements IBoardDisplay{

    @Override
    public void display(Board board) {
        for(int i=0; i<board.size()*board.size(); i++){
            System.out.print(board.spots().get(i));
            if((i+1)%board.size()==0) System.out.println();
            else System.out.print(" | ");
        }
    }
}

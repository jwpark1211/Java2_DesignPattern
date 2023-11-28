package solution;

public class BoardTest {

    Board[] boards = {new Board(2), new Board(3), new Board(4), new Board(5)};
    IBoardDisplay presenter = new BoardDisplay();
    BoardShaper shaper = new BoardShaper();

    public BoardTest() {
        for (Board board: boards) {
            
            // board display
            presenter.display(board);
            
            // set board in a shaper
            shaper.setBoard(board);
            
            // boardReturnsRow
            for (int index = 1 ; index <= board.size(); index++) {
                System.out.println("row#" + index + " " + shaper.row(index));
            }
            
            // boardReturnsColumn
            for (int index = 1 ; index <= board.size(); index++) {
                System.out.println("column#" + index + " " + shaper.column(index));
            }
            
            // boardReturnsDiagonal
            System.out.println("diagonal " + shaper.diagonal());
            
            // boardReturnsTranspose
            Board transpose = shaper.transpose();
            System.out.println("transpose");
            presenter.display(transpose);

            System.out.println();
            System.out.println("===============================");
            System.out.println();
        }
    }
}

public class Board {
  private Tile[][] tiles = new Tile[8][8];
  public Piece[] removedPieces;

  public Board(){
    for (int i = 0; i < tiles.length; i++){
      for (int j = 0; j < tiles.length; j++){
        color = (i + j % 2 == 0) ? true: false;
        this.tiles[i][j] = new Tile(i, j, color);
      }
    }
  }

  public getTile(int x, int y){
    return this.tiles[x][y]
  }

}

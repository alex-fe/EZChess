public class Board {
  private Tile[][] tiles = new Tile[8][8];

  public Board(){
    for (int i = 0; i < tiles.length; i++){
      for (int j = 0; j < tiles.length; j++){
        this.tiles[i][j] = new Tile(i, j);
      }
    }
  }

  public getTile(int x, int y){
    return tiles[x][y]
  }

}

public class Piece {
  private int x;
  private int y;
  private boolean inGame;
  public boolean color;

  public Piece(int x, int y, boolean inGame){
    this.x = x;
    this.y = y;
    this.inGame = inGame;
  }


	/**
	* Returns value of x
	* @return
	*/
	public int getX() {
		return x;
	}

	/**
	* Sets new value of x
	* @param
	*/
	public void setX(int x) {
		this.x = x;
	}

	/**
	* Returns value of y
	* @return
	*/
	public int getY() {
		return y;
	}

	/**
	* Sets new value of y
	* @param
	*/
	public void setY(int y) {
		this.y = y;
	}

	/**
	* Returns value of inGame
	* @return
	*/
	public boolean isInGame() {
		return inGame;
	}

	/**
	* Sets new value of inGame
	* @param
	*/
	public void setInGame(boolean inGame) {
		this.inGame = inGame;
	}

  /**
  * Returns value of color
  * @return
  */
  public boolean getColor() {
    return color;
  }

  /**
  * Sets new value of color
  * @param
  */
  public void setColor (boolean color) {
    this.color = color;
  }
}

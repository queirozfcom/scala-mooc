import streams.{GameDef, InfiniteTerrain}

object Troubleshooting extends GameDef with InfiniteTerrain{

  def main(args: Array[String] = Array.empty) {
    val b = Block(Pos(1,1),Pos(1,1))

    b.neighbors
  }

  override val goal = Pos(2,2)
  override val startPos: Troubleshooting.Pos = Pos(2,2)
}

Troubleshooting.main()
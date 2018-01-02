class MovieLister {
  def moviesDirectedBy(arg: String): Array[Nothing] = {
    val allMovies = finder.findAll
    val it = allMovies.iterator
    while ( {
      it.hasNext
    }) {
      val movie = it.next.asInstanceOf[Nothing]
      if (!movie.getDirector.equals(arg)) it.remove
    }
    allMovies.toArray(new Array[Nothing](allMovies.size)).asInstanceOf[Array[Nothing]]
  }
}

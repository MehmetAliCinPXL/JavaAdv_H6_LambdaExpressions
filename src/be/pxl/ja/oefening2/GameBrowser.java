package be.pxl.ja.oefening2;

import java.util.List;
import java.util.function.Predicate;

public class GameBrowser {

	private GameCollection gameCollection;


	public GameBrowser(GameCollection gameCollection) {
		this.gameCollection = gameCollection;
	}

	public List<VideoGame> showFreeGames() {
		Predicate<VideoGame> filter = v -> v.getPrice() == 0;
		return gameCollection.selectGame(filter);
	}

	public List<VideoGame> showGamesInGenre(String action) {
		Predicate<VideoGame> filter = v -> v.getGenres().contains(action);
		return gameCollection.selectGame(filter);
	}

	public List<VideoGame> showGamesForSearch(String cd) {
		Predicate<VideoGame> filter = new Predicate<VideoGame>() {
			@Override
			public boolean test(VideoGame videoGame) {
				if (videoGame.getName().toLowerCase().contains(cd.toLowerCase())){
					return true;
				}else {
					return false;
				}
			}
		};

		return gameCollection.selectGame(filter);
	}
}

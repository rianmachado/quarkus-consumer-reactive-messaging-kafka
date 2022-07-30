package rian.demo.kafka.consumer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import io.smallrye.mutiny.Multi;
import rian.demo.kafka.Movie;
import rian.demo.kafka.PlayedMovie;

@Path("/movies")
public class PlayedMovieResource {

	@Inject
	Logger logger;

	@Channel("played-movies")
	Multi<PlayedMovie> playedMovies;

	@GET
	@Produces(MediaType.SERVER_SENT_EVENTS)
	public Multi<PlayedMovie> stream() {
		return playedMovies;
	}

	@Incoming("movies")
	public void newMovie(Movie movie) {
		logger.info("New movie: " + movie.toString());
	}
}

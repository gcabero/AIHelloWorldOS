package controllers;

import models.Photo;
import play.mvc.Controller;
import play.mvc.Result;


public class Application extends Controller {

    public static Result index() {
        return redirect(routes.Application.retrievePhoto("pink-panther"));
    }

    public static Result retrievePhoto(String name) {
        Photo photo = models.Photo.findByName(name);
        return ok(views.html.photos.render(photo,"Voila!"));
    }
}

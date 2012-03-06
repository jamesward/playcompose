package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        compose("world");
    }

    public static void compose() {
        compose("");
    }

    public static void compose(String content) {
        render(content);
    }

}

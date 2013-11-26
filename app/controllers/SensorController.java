
package controllers;

import models.metadata.Sensor;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class SensorController extends Controller {
	final static Form<Sensor> sensorForm = Form.form(Sensor.class);
	
    public static Result sensors() {
    	return ok(sensor.render(Sensor.all(),sensorForm));
    }
    public static Result newSensor() {
    	return TODO;
    }
    public static Result deleteSensor(Long id) {
        return TODO;
    }
}
    
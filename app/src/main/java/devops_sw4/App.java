package devops_sw4;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;

public class App {
    public static void main(String[] args) {
        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
		builder.width(50).height(10);
		builder.element(new PseudoText("DevOps W4"));
		ICanvas canvas = render.render(builder.build());
		String s = canvas.getText();
		System.out.println(s);
    }

    public Object getGreeting() {
        return null;
    }
}
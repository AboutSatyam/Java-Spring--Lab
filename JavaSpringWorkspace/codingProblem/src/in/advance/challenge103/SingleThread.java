package in.advance.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {

	public static void main(String[] args) {
		try (ExecutorService service = Executors.newSingleThreadExecutor()) {
			PrintNumberExecutor task = new PrintNumberExecutor();
			service.submit(task);
			// service.shutdown(); //Automatic In Try Block Block
		}
	}

}

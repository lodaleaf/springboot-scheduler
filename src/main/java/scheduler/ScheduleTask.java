package scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

  @Scheduled(cron = "*/3 * * * * *")
  public void execute() {
    System.out.println("Runnnnn");
  }
}
package net.loyintean.blog.thread.basic;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 演示Timer/TimerTask的几种问题
 * 
 * @author linjun
 */
public class SheduleByTimer {

	public static void main(String[] args) {
		// 问题1：任务执行时间超过了任务调度间隔时间
		// 如，任务执行需要1s；任务间隔时间只有100ms
		TimerTask task1 = new TimerTask() {
			private int times = 0;
			// 用来计算两次任务之间的实际时间间隔
			private long lastTime = System.currentTimeMillis();

			@Override
			public void run() {
				long now = System.currentTimeMillis();
				// 这句日志用来记录本次任务启动与上一次任务启动之间的间隔
				// 正常情况下，这个间隔应当是timer.shedler()时指定的间隔
				// 但随着任务耗时逐渐增加，这个间隔也会逐步变大。
				System.out.println((now - lastTime) + " " + Thread.currentThread().getName()
						+ " task-1 executed! times = " + (times++));
				lastTime = now;
				try {
					// 任务耗时逐渐增加，慢慢地会超出任务调度的间隔时间
					Thread.sleep(times * 10l);
					if (times > 50) {
						// 而当TimerTask中抛出了异常之后，Timer会终止调度（是终止不是中止）
						throw new RuntimeException();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};

		TimerTask task2 = new TimerTask() {

			private int times = 0;
			// 用来计算两次任务之间的实际时间间隔
			private long lastTime = System.currentTimeMillis();

			@Override
			public void run() {
				long now = System.currentTimeMillis();
				// 这句日志用来记录本次任务启动与上一次任务启动之间的间隔
				// 作为对照，这个间隔应当是timer.shedler()时指定的间隔
				System.out.println((now - lastTime) + " " + Thread.currentThread().getName()
						+ " task-2 executed! times = " + (times++));
				lastTime = now;
				try {
					Thread.sleep(10l);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};

		Timer timer = new Timer();
		// 任务间隔只有100ms，随着任务耗时主键增加，可以检查一下
		timer.schedule(task1, 100l, 100l);
		timer.schedule(task2, 100l, 200l);

	}
}

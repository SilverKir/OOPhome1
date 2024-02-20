package seminar.sem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queue= new ArrayList<>();



    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Проходите пожалуйста в магазин " + actor.getName());
        takeInQueue(actor);

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor : actors){
            queue.remove(actor);
            System.out.println( "Всего доброго "+ actor.getName()+ "! Ждем Вас снова за покупками!");
        }

    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Вставайте в очередь " + actor.getName() + " и выбирайте товар.");
        queue.add(actor);
        update();
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + ", вижу Вы сделали заказ.");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получите пожалуйста заказ.");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder) {
                releasedActors.add(actor);
                System.out.println( " Спасибо за покупки! "+ actor.getName());
            }
        }
        releaseFromMarket(releasedActors);
    }

    public void comeGetSome(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Здравствуйте наш дорогой покупатель! Как Вас зовут?");
        Human human=new Human(scanner.nextLine());
        scanner.close();
        acceptToMarket(human);

    }
}

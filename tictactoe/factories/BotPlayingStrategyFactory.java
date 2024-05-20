package tictactoe.factories;

import tictactoe.models.BotLevel;
import tictactoe.strategies.bot_playing.BotPlayingStrategy;
import tictactoe.strategies.bot_playing.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {


    public static BotPlayingStrategy getBotPlayingStrategy(BotLevel botLevel){
        switch (botLevel){
            case EASY:
            case MEDIUM:
            case DIFFICULT:
                return new EasyBotPlayingStrategy();
            default:
                throw new UnsupportedOperationException("The given bot level is not supported");
        }

    }
}

package group11.comp3211.model.piece;

import group11.comp3211.model.JungleType;
import group11.comp3211.model.Player;
import group11.comp3211.view.Language;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class Lion extends Piece {
    public Lion(int row, int col, Player player) {
        super(row, col, player);
        this.rank = 7;
        this.type = JungleType.LION;
    }

    @Override
    public String getSymbol(Language language) {
        return switch (language) {
            case ENGLISH -> "LN";
            case CHINESE_SIMPLE -> "狮";
            case CHINESE_TRADITIONAL -> "獅";
        };
    }
}

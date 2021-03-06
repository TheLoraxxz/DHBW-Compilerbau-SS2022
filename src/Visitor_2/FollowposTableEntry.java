package Visitor_2;

import java.util.HashSet;
import java.util.Set;

public class FollowposTableEntry {
    public final int position;
    public final String symbol;
    public Set<Integer> followpos;
    public FollowposTableEntry(int position, String symbol)
    {
        this.position = position;
        this.symbol = symbol;
        followpos  = new HashSet<Integer>();        //mit leerer Menge initialisieren
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (! (obj instanceof FollowposTableEntry))
        {
            return false;
        }
        FollowposTableEntry other = (FollowposTableEntry) obj;
        return this.position == other.position &&
                this.symbol.equals(other.symbol) &&
                this.followpos.equals(other.followpos);
    }
    @Override
    public int hashCode()
    {
        int hashCode = this.position;
        hashCode = 31 * hashCode + this.symbol.hashCode();
        hashCode = 31 * hashCode + this.followpos.hashCode();
        return hashCode;
    }

    public void Setfollowpos(Integer nValue)
    {
        followpos.add(nValue);
    }
}

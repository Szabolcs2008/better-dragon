Watch me figure things out in real-time

## Items
Add an item: just copy-paste from the tutorial and don't fuck up the required json files\
Add things to the item:
1. Make a class for the item
2. this 
```java
public class ItemName extends Item {
    public ItemName(Settings settings) {
        super(settings);
    }
    
    // functional shit goes here
    
    // 1.
    // do a thing on right click
    public ActionResult use(World world, PlayerEntity player, Hand hand) {
        
        // code
        
        return ActionResult.PASS; // or something that is an ActionResult
    }
    
}
```


## Random things that might be useful later
```java
// modify a stat of a player (modify hp from an item use in this case)
public ActionResult use(World world, PlayerEntity player, Hand hand) {
    
    // this is the interesting part of the code
    // (whatever the fuck this spaghetti is)
    player.getAttributeInstance(EntityAttributes.MAX_HEALTH)
            .addPersistentModifier(
                    new EntityAttributeModifier(
                            Identifier.of("plus_hp"), // This doesn't even matter why is it even here
                            1, // amount to modify with
                            EntityAttributeModifier.Operation.ADD_VALUE // what to do
                    )
            );
    
    
    return ActionResult.PASS; // or something that is an ActionResult
}

```

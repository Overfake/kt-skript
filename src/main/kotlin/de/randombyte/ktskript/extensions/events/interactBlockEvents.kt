package de.randombyte.ktskript.extensions.events

import org.spongepowered.api.block.BlockSnapshot
import org.spongepowered.api.event.block.InteractBlockEvent

val InteractBlockEvent.clickedInAir: Boolean
    get() = targetBlock == BlockSnapshot.NONE
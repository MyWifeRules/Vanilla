/*
 * This file is part of Vanilla (http://www.spout.org/).
 *
 * Vanilla is licensed under the SpoutDev License Version 1.
 *
 * Vanilla is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * Vanilla is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.vanilla.protocol.msg;

import org.spout.api.protocol.Message;

public final class EntityAnimationMessage extends Message {
	public static final byte ANIMATION_SWING_ARM = 1;
	public static final byte ANIMATION_HURT = 2;
	public static final byte ANIMATION_LEAVE_BED = 3;
	public static final byte ANIMATION_EAT_FOOD = 3;
	public static final byte ANIMATION_UNKNOWN = 102;
	public static final byte ANIMATION_CROUCH = 104;
	public static final byte ANIMATION_UNCROUCH = 105;
	private final int id;
	private final byte animation;

	public EntityAnimationMessage(int id, byte animation) {
		this.id = id;
		this.animation = animation;
	}

	public int getId() {
		return id;
	}

	public byte getAnimation() {
		return animation;
	}

	@Override
	public String toString() {
		return "AnimateEntityMessage{id=" + id + ",animation=" + animation + "}";
	}
}

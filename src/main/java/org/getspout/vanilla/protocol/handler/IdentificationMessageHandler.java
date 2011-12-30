package org.getspout.vanilla.protocol.handler;

import org.getspout.api.player.Player;
import org.getspout.api.protocol.MessageHandler;
import org.getspout.api.protocol.Session;
import org.getspout.vanilla.protocol.msg.IdentificationMessage;

public final class IdentificationMessageHandler extends MessageHandler<IdentificationMessage> {
	@Override
	public void handle(Session session, Player player, IdentificationMessage message) {
		/*SpoutSession.State state = session.getState();

		// Are we at the proper stage?
		if (state == SpoutSession.State.EXCHANGE_IDENTIFICATION) {
			if (message.getId() < SpoutServer.PROTOCOL_VERSION) {
				session.disconnect("Outdated client!");
			} else if (message.getId() > SpoutServer.PROTOCOL_VERSION) {
				session.disconnect("Outdated server!");
			}
			boolean allow = true; // Default to okay

			// If we're in online mode, attempt to verify with mc.net
			if (session.getServer().getOnlineMode()) {
				allow = false;
				try {
					URL verify = new URL("http://session.minecraft.net/game/checkserver.jsp?user=" + URLEncoder.encode(message.getName(), "UTF-8") + "&serverId=" + URLEncoder.encode(session.getSessionId(), "UTF-8"));
					BufferedReader reader = new BufferedReader(new InputStreamReader(verify.openStream()));
					String result = reader.readLine();
					reader.close();
					allow = result.equals("YES"); // Get minecraft.net's result. If the result is YES, allow login to continue
				} catch (IOException ex) {
					// Something went wrong, disconnect the player
					session.getServer().getLogger().log(Level.WARNING, "Failed to authenticate {0} with minecraft.net: {1}", new Object[] {message.getName(), ex.getMessage()});
					session.disconnect("Player identification failed [" + ex.getMessage() + "]");
				}
			}

			// Was the player allowed?
			if (allow) {
				PlayerPreLoginEvent event = EventFactory.onPlayerPreLogin(message.getName(), session);
				if (event.getResult() != PlayerPreLoginEvent.Result.ALLOWED) {
					session.disconnect(event.getKickMessage());
				}
				SpoutPlayer newPlayer = new SpoutPlayer(session, event.getName()); // TODO case-correct the name
				session.setPlayer(newPlayer);
			} else {
				session.getServer().getLogger().log(Level.INFO, "Failed to authenticate {0} with minecraft.net.", message.getName());
				session.disconnect("Player identification failed!");
			}
			session.setState(State.GAME);
		} else {
			// Kick if they send ident at the wrong time
			boolean game = state == State.GAME;
			session.disconnect(game ? "Identification already exchanged." : "Handshake not yet exchanged.");
		}
		*/
	}
}
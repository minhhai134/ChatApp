package SD.ChatApp.service.network;

import SD.ChatApp.model.network.Block;
import SD.ChatApp.repository.network.BlockRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockRepository blockRepository;

    public boolean checkBlockstatus(String blockerUserId, String destinationUserId) {
        return blockRepository.findByBlockerUserIdAndDestinationUserId(blockerUserId, destinationUserId).isPresent();
    }

    public Block block(String blockerUserId, String destinationUserId) {
        return blockRepository.save(Block.builder().
                blockerUserId(blockerUserId).
                destinationUserId(destinationUserId).
                build());
    }

    public void unBlock(String blockId) {
        log.info("BlockId: {}",blockId );
        blockRepository.deleteById(blockId);
    }
}
